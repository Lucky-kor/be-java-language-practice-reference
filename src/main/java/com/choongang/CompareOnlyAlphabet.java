package com.choongang;

public class CompareOnlyAlphabet {
    public boolean compareOnlyAlphabet(String str1, String str2) {
        boolean result;
        // TODO: str1, str2 두개의 문자열을 대소문자를 구분하지 않고(case insensitive) 서로 같은지 여부를 할당해야 합니다.
        // 같다면 result에 true를, 다르다면 result에 false를 할당해야 합니다.
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        result = lowerStr1.equals(lowerStr2);

        //아래 코드는 수정하지 말아야 합니다.
        return result;
    }
}
