//package com.pramod.javarx;/*
// * Copyright (C) 2020 NCR Corporation. This material contains certain trade
// * secrets and confidential and proprietary information of NCR Corporation.
// * Use, reproduction, disclosure and distribution by any means are prohibited,
// * except pursuant to a written license from NCR Corporation. Use of copyright
// * notice is precautionary and does not imply publication or disclosure.
// */
//
//import rx.Observable;
//import rx.Subscription;
//
//import java.math.BigInteger;
//
///*
// * @ ps185370
// */
//public class ObservableTesting {
// public static void main(){
//  Observable<BigInteger> naturalNumbers = Observable.create(
//          subscriber -> {
//           Runnable r=()->{
//            BigInteger i = new BigInteger("ZERO");
//            while (!subscriber.isUnsubscribed()) {
//             subscriber.onNext(i);
//             i = i.add(new BigInteger("ONE"));
//            }
//           };
//           new Thread(r).start(); });
//
////  Subscription subscription = naturalNumbers.
////          subscribe(x -> log(x)); //after some time...
////  subscription.unsubscribe();
// }
//}
