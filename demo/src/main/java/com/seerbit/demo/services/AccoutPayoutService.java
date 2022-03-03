package com.seerbit.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seerbit.demo.exception.ReferenceNumberMustBeUniqieException;
import com.seerbit.demo.exception.ResourceNotFoundException;
import com.seerbit.demo.exception.TransactionFailedException;
import com.seerbit.demo.mapstruct.mapper.AccountPayoutMapper;
import com.seerbit.demo.mapstruct.mapper.CashPickUpMapper;
import com.seerbit.demo.mapstruct.mapper.CheckStatusMapper;
import com.seerbit.demo.mapstruct.mapper.FundTransferToWalletMapper;
import com.seerbit.demo.models.AccountPayout;
import com.seerbit.demo.models.CashPickUp;
import com.seerbit.demo.payload.request.AccountPayoutPOJO;
import com.seerbit.demo.payload.request.CancelCashPickUpTranasctionPOJO;
import com.seerbit.demo.payload.request.CashPickUpPOJO;
import com.seerbit.demo.payload.request.FundTransferToWalletPOJO;
import com.seerbit.demo.payload.request.RecipientPOJO;
import com.seerbit.demo.payload.request.SenderPOJO;
import com.seerbit.demo.payload.response.CheckStatusResponse;
import com.seerbit.demo.payload.response.Lock;
import com.seerbit.demo.payload.response.PayoutResponsePOJO;
import com.seerbit.demo.payload.response.ReferenceTransactionPOJO;
import com.seerbit.demo.repository.CashPickUpRepository;
import com.seerbit.demo.repository.FundTransferToWalletRepository;
import com.seerbit.demo.repository.PayoutRepository;
import com.seerbit.demo.util.TransactionCode;

@Service
public class AccoutPayoutService {

	private PayoutRepository payoutRepository;
	private AccountPayoutMapper accountPayoutMapper;
	private FundTransferToWalletMapper fundTransferToWalletMapper;
	private FundTransferToWalletRepository fundTransferToWalletRepository;
	private CheckStatusMapper checkStatusMapper;
	private CashPickUpMapper cashPickUpMapper;
	private CashPickUpRepository cashPickUpRepository;
	
	AccoutPayoutService(PayoutRepository payoutRepository,AccountPayoutMapper accountPayoutMapper,FundTransferToWalletMapper fundTransferToWalletMapper,
			FundTransferToWalletRepository fundTransferToWalletRepository,CheckStatusMapper checkStatusMapper,CashPickUpMapper cashPickUpMapper,CashPickUpRepository cashPickUpRepository){
		this.payoutRepository = payoutRepository;
		this.accountPayoutMapper = accountPayoutMapper;
		this.fundTransferToWalletMapper = fundTransferToWalletMapper;
		this.fundTransferToWalletRepository = fundTransferToWalletRepository;
		this.checkStatusMapper = checkStatusMapper;
		this.cashPickUpMapper =cashPickUpMapper;
		this.cashPickUpRepository =cashPickUpRepository;
//		this.cancelCashPickUpTransactionMapper = cancelCashPickUpTransactionMapper;
	}
	
	@Transactional
	public PayoutResponsePOJO createPayout(AccountPayoutPOJO payout) {
		PayoutResponsePOJO payoutResponse = new PayoutResponsePOJO();
		try {
			AccountPayoutPOJO entity = accountPayoutMapper
					.toEntity(payoutRepository.save(accountPayoutMapper.toDto(payout)));

			payoutResponse.setCode(TransactionCode.TRA_SUCCESSFUL);
			payoutResponse.setMessage("Successful");
			ReferenceTransactionPOJO referenceTransactionPOJO = new ReferenceTransactionPOJO();
			referenceTransactionPOJO.setReference(entity.getTransaction().getReference());
			referenceTransactionPOJO.setLinkingreference(null); // todo: need to understand from where to collect
																// referenceId
			payoutResponse.setTransaction(referenceTransactionPOJO);
		} catch (Exception e) {
			throw new TransactionFailedException("Transaction Failed");
		}
		return payoutResponse;
	}

	@Transactional
	public PayoutResponsePOJO createAccountToTransferWallet(FundTransferToWalletPOJO fundTransferToWalletPOJO) {
		PayoutResponsePOJO payoutResponse = new PayoutResponsePOJO();
		try {
			FundTransferToWalletPOJO fundTransfer = extracted(fundTransferToWalletPOJO);
			
			payoutResponse.setCode(TransactionCode.TRA_SUCCESSFUL);
			payoutResponse.setMessage("Successful");
			ReferenceTransactionPOJO referenceTransactionPOJO = new ReferenceTransactionPOJO();
			referenceTransactionPOJO.setReference(fundTransfer.getTransaction().getReference());
			referenceTransactionPOJO.setLinkingreference(null); // todo: need to understand from where to collect
			payoutResponse.setTransaction(referenceTransactionPOJO);
		} catch (Exception e) {
			throw new TransactionFailedException("Transaction Failed");
		}
		return payoutResponse;
	}

	private FundTransferToWalletPOJO extracted(FundTransferToWalletPOJO fundTransferToWalletPOJO) {
		return fundTransferToWalletMapper
				.toEntity(fundTransferToWalletRepository.save(fundTransferToWalletMapper.toDto(fundTransferToWalletPOJO)));
	}

	public CheckStatusResponse chectStatus(String referenceNo) {
		CheckStatusResponse checkStatusResponse=null;
		try {

			AccountPayout accountPayout = payoutRepository.findByTransactionReference(referenceNo);
			 checkStatusResponse = checkStatusMapper.toEntity(accountPayout);
			
			if(checkStatusResponse == null) {
				throw new ResourceNotFoundException("No Data Found");
			}else {
				checkStatusResponse.setCode(TransactionCode.TRA_SUCCESSFUL);
				checkStatusResponse.setMessage("Successful");
				ReferenceTransactionPOJO referenceTransactionPOJO = new ReferenceTransactionPOJO();
				referenceTransactionPOJO.setReference(referenceNo);
				referenceTransactionPOJO.setLinkingreference(null); // todo: need to understand from where to collect
																	// referenceId
				checkStatusResponse.setTransaction(referenceTransactionPOJO);
				Lock lock = new Lock();
				lock.setStatus("0");
				checkStatusResponse.setLock(lock);
			}
			
		} catch (Exception e) {
			throw new TransactionFailedException("Transaction Failed");
		}
		return checkStatusResponse;
	}
	
	@Transactional
	public PayoutResponsePOJO createPayoutCashPickUp(CashPickUpPOJO cashPickUpPOJO) {
		PayoutResponsePOJO payoutResponse = new PayoutResponsePOJO();
		try {

			CashPickUp cashPickUp = cashPickUpRepository.save(cashPickUpMapper.toDto(cashPickUpPOJO));
			if (cashPickUp != null) {
				payoutResponse.setCode(TransactionCode.TRA_SUCCESSFUL);
				payoutResponse.setMessage("Successful");
				ReferenceTransactionPOJO referenceTransactionPOJO = new ReferenceTransactionPOJO();
				referenceTransactionPOJO.setReference(cashPickUp.getTransaction().getReference());
				referenceTransactionPOJO.setLinkingreference(null); // todo: need to understand from where to collect
				payoutResponse.setTransaction(referenceTransactionPOJO);
			} else if (cashPickUp == null) {
				throw new ResourceNotFoundException("No Data Found");
			}
		} catch (Exception e) {
			throw new TransactionFailedException("Transaction Failed");
		}
		return payoutResponse;
	}
	
	@Transactional
	public PayoutResponsePOJO cancelCashPickUpTransaction(CancelCashPickUpTranasctionPOJO fundTransferToWalletPOJO) {
		PayoutResponsePOJO payoutResponse = new PayoutResponsePOJO();
		try {

			CashPickUpPOJO cashPickUpPoJo = cashPickUpMapper.toEntity(cashPickUpRepository
					.findByTransactionReference(fundTransferToWalletPOJO.getTransaction().getReference()));
			cashPickUpPoJo.setPublickey(fundTransferToWalletPOJO.getPublickey());
			cashPickUpPoJo.setTransaction(fundTransferToWalletPOJO.getTransaction());
			cashPickUpPoJo.setOrder(fundTransferToWalletPOJO.getOrder());
			cashPickUpPoJo.setSource(fundTransferToWalletPOJO.getSource());

			CashPickUp save = cashPickUpRepository.save(cashPickUpMapper.toDto(cashPickUpPoJo));
			
			payoutResponse.setCode(TransactionCode.TRA_SUCCESSFUL);
			payoutResponse.setMessage("Cancel Successfully");
			ReferenceTransactionPOJO referenceTransactionPOJO = new ReferenceTransactionPOJO();
			referenceTransactionPOJO.setReference(save.getTransaction().getReference());
			referenceTransactionPOJO.setLinkingreference(null); // todo: need to understand from where to collect
			payoutResponse.setTransaction(referenceTransactionPOJO);
		} catch (Exception e) {
			throw new ReferenceNumberMustBeUniqieException("Transaction reference must be unique");
		}
		return payoutResponse;
	}
	
	@Transactional
	public PayoutResponsePOJO updateCashPickUpTransaction(CancelCashPickUpTranasctionPOJO fundTransferToWalletPOJO) {
		PayoutResponsePOJO payoutResponse = new PayoutResponsePOJO();
		try {

			CashPickUpPOJO cashPickUpPoJo = cashPickUpMapper.toEntity(cashPickUpRepository
					.findByTransactionReference(fundTransferToWalletPOJO.getTransaction().getReference()));
			if(cashPickUpPoJo != null) {
				RecipientPOJO recipient = cashPickUpPoJo.getSource().getRecipient();
				SenderPOJO sender = cashPickUpPoJo.getSource().getSender();
				recipient.setName(fundTransferToWalletPOJO.getSource().getRecipient().getName());
				cashPickUpPoJo.setSource(fundTransferToWalletPOJO.getSource());
				cashPickUpPoJo.getSource().setRecipient(recipient);
				cashPickUpPoJo.getSource().setSender(sender);

				cashPickUpRepository.save(cashPickUpMapper.toDto(cashPickUpPoJo));
				payoutResponse.setCode(TransactionCode.TRA_SUCCESSFUL);
				payoutResponse.setMessage("Update Successfully");
				payoutResponse.setTransaction(new ReferenceTransactionPOJO());
			}else if(cashPickUpPoJo == null) {
				throw new ResourceNotFoundException("No Data Found");
			}
		}
		catch (Exception e) {
			throw new ReferenceNumberMustBeUniqieException("Transaction reference must be unique");            
		}
		return payoutResponse;
		
	}
}
