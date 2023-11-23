//package JavaCommonQA;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class CaptilizeEachFirstLetter {
//    public static void main(String[] args) {
//        String str = "hoW aRe yOU";
//        System.out.println("Before Capitalize: "+str);
//        String result=capitalizeAll(str);
//        System.out.println("After Capitalize: "+result);
//    }
//    public static String capitalizeAll(String str){
////        if (str==null ||str.isEmpty()){
////            return "";
////        }
//        return Pattern.compile("\\b(\\p{L})(\\p{L}+)\\b")
//                .matcher(str).replaceAll(match->match.group(1).toUpperCase()+match.group(2).toLowerCase())
//                .replaceAll("\\p{Zs}","_");
//
//    }
//
//    }
//
//
