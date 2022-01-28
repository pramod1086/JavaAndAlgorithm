//package com.pramod;
//
//import com.sun.xml.internal.ws.util.StringUtils;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.UUID;
//import java.util.stream.Collectors;
//
//public class Testing {
//    public static void main(String args[]){
//        //65122a77-ea53-31f1-a9ed-8ee9b98c36ff
//        String str ="01369_P2_NCR3A_210601.zip";
//        UUID uuid = UUID.nameUUIDFromBytes(str.getBytes());
//        System.out.println(uuid);
//
//        String fileName = "gs://dbk-ts-pipeline-batch-bkmws/batch-importers/process/bkmws-batch-importer/bkmws-batch-importer/01369_P2_NCR3A_210601.zip.1";
//        List<String> inputList = Arrays.stream(fileName.split("/")).collect(Collectors.toList());
//        String FileName = null;
//
//
//        if (!inputList.isEmpty()) {
//            FileName = inputList.get(0);
//        }
//      String res=  inputList.stream().filter(token->token.equals("01369_P2_NCR3A_210601.zip.1")).findAny().orElse(null);
//
//        System.out.println(res);
//    }
//    public boolean checkString(String s) {
//
//        for(int i=0;i<s.length();i++){
//            if((s.charAt(i-1)=='b')&&s.charAt(i)=='a'){
//
//                return false;
//            }
//
//
//        }
//        return true;
//
//    }
//}
