package com.seerbit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seerbit.demo.exception.PublicKeyNotNullException;
import com.seerbit.demo.payload.request.AccountPayoutPOJO;
import com.seerbit.demo.payload.request.CancelCashPickUpTranasctionPOJO;
import com.seerbit.demo.payload.request.CashPickUpPOJO;
import com.seerbit.demo.payload.request.FundTransferToWalletPOJO;
import com.seerbit.demo.services.AccoutPayoutService;

@RestController
@RequestMapping("/api")
public class PayoutController {
	
	@Autowired
	private AccoutPayoutService accountPayoutService;
	
	@PostMapping("/account/payout")
	public ResponseEntity<?> createPayout(@RequestBody AccountPayoutPOJO payout) {
		if(payout.getPublickey() == null || payout.getPublickey().length()<=0) {
			throw new PublicKeyNotNullException("Missing publickey");
		}else {
			return ResponseEntity.ok(accountPayoutService.createPayout(payout));
		}
	}
	
	@PostMapping("/account/payout/transfer")
	public ResponseEntity<?> transferFundtoAccountWallet(@RequestBody FundTransferToWalletPOJO fundTransferToWalletPOJO) {
		if (fundTransferToWalletPOJO.getPublickey() == null || fundTransferToWalletPOJO.getPublickey().length()<=0) {
			throw new PublicKeyNotNullException("Missing publickey");
		} else {
			return ResponseEntity.ok(accountPayoutService.createAccountToTransferWallet(fundTransferToWalletPOJO));
		}
	}

	@GetMapping("/payout/status")
//	@PreAuthorize("hasRole('MODERATOR')")
	public ResponseEntity<?> checkStatus(@RequestParam("reference") String referenceNo) {
		return  ResponseEntity.ok(accountPayoutService.chectStatus(referenceNo));
	}
	
	@PostMapping("/payout/create")
	public ResponseEntity<?> createPayoutCashPickUp(@RequestBody CashPickUpPOJO cashPickUpPOJO) {
		if (cashPickUpPOJO.getPublickey() == null || cashPickUpPOJO.getPublickey().length()<=0) {
			throw new PublicKeyNotNullException("Missing publickey");
		} else {
			return ResponseEntity.ok(accountPayoutService.createPayoutCashPickUp(cashPickUpPOJO));
		}
	}
	
	@PostMapping("/payout/cancel")
	public ResponseEntity<?> cancelCashPickUpTransaction(@RequestBody CancelCashPickUpTranasctionPOJO cancelCashPickUpTranasctionPOJO) {
		if (cancelCashPickUpTranasctionPOJO.getPublickey() == null || cancelCashPickUpTranasctionPOJO.getPublickey().length()<=0) {
			throw new PublicKeyNotNullException("Missing publickey");
		} else {
			return ResponseEntity.ok(accountPayoutService.cancelCashPickUpTransaction(cancelCashPickUpTranasctionPOJO));
		}
	}
	
	@PostMapping("/payout/update")
	public ResponseEntity<?> updateCashPickUpTransaction(@RequestBody CancelCashPickUpTranasctionPOJO cancelCashPickUpTranasctionPOJO) {
		if (cancelCashPickUpTranasctionPOJO.getPublickey() == null || cancelCashPickUpTranasctionPOJO.getPublickey().length()<=0) {
			throw new PublicKeyNotNullException("Missing publickey");
		} else {
			return ResponseEntity.ok(accountPayoutService.updateCashPickUpTransaction(cancelCashPickUpTranasctionPOJO));
		}
	}
}
