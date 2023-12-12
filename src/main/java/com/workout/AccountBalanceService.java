package com.workout;

import com.workout.example.AccountBalance;
import com.workout.example.AccountBalanceServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class AccountBalanceService extends AccountBalanceServiceGrpc.AccountBalanceServiceImplBase {

        @Override
        public void changeAccountBalance(AccountBalance.MessageRequest request, StreamObserver<AccountBalance.MessageResponse> responseObserver) {
            // super.sayHello(request, responseObserver);
            responseObserver.onNext(
                AccountBalance.MessageResponse.newBuilder().setStatus(new StringBuilder(request.getCodeAccount()).toString() + " Status 200")
                    .build()
            );

            responseObserver.onCompleted();

        }
    }

