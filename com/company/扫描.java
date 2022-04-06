package com.company;

public class 扫描 {
    public static void main(String[] args) {
        System.out.println(maximumSubsequenceCount("vnedkpkkyxelxqptfwuzcjhqmwagvrglkeivowvbjdoyydnjrqrqejoyptzoklaxcjxbrrfmpdxckfjzahparhpanwqfjrpbslsyiwbldnpjqishlsuagevjmiyktgofvnyncizswldwnngnkifmaxbmospdeslxirofgqouaapfgltgqxdhurxljcepdpndqqgfwkfiqrwuwxfamciyweehktaegynfumwnhrgrhcluenpnoieqdivznrjljcotysnlylyswvdlkgsvrotavnkifwmnvgagjykxgwaimavqsxuitknmbxppgzfwtjdvegapcplreokicxcsbdrsyfpustpxxssnouifkypwqrywprjlyddrggkcglbgcrbihgpxxosmejchmzkydhquevpschkpyulqxgduqkqgwnsowxrmgqbmltrltzqmmpjilpfxocflpkwithsjlljxdygfvstvwqsyxlkknmgpppupgjvfgmxnwmvrfuwcrsadomyddazlonjyjdeswwznkaeaasyvurpgyvjsiltiykwquesfjmuswjlrphsdthmuqkrhynmqnfqdlwnwesdmiiqvcpingbcgcsvqmsmskesrajqwmgtdoktreqssutpudfykriqhblntfabspbeddpdkownehqszbmddizdgtqmobirwbopmoqzwydnpqnvkwadajbecmajilzkfwjnpfyamudpppuxhlcngkign"
                , "rr"));
    }

    public static long maximumSubsequenceCount(String text, String pattern) {
        long jichu = 0;
        long a = pattern.charAt(0);
        long b = pattern.charAt(1);
//        for (int i=0;i<text.length();i++){
//            if (text.charAt(i)==a){
//                for (int j=i+1;j<text.length();j++){
//                    if (text.charAt(j)==b){
//                        jichu++;
//                    }
//                }
//            }
//        }

        long counta = 0;
        long countb = 0;
        if (a == b) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == a) {
                    counta++;
                }
            }
            for (long i = counta - 1; i >= 0; i--) {
                jichu+=i;
            }
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == a) {
                    counta++;
                } else if (text.charAt(i) == b) {
                    countb++;
                    jichu += counta;
                }
            }
        }

        long max = 0;
        long sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == b) {
                sum++;
            }
        }
        max = sum;
        sum = 0;
        for (int i = text.length() - 1; i > 0; i--) {
            if (text.charAt(i) == a) {
                sum++;
            }
        }
        if (max < sum) {
            max = sum;
        }
        max = jichu + max;

        return max;
    }

}
