package com.choongang;

public class ShowTime {
    public String showTime(int hour, int min, int sec) {
        String result;
        //TODO: 시간, 분, 초를 입력받아 현재 시각을 나타내는 메세지를 result에 할당해야 합니다.
        // hour가 1, min이 30, sec가 25라면
        // '현재 시각은 1시 30분 25초 입니다.'와 같은 문자열을 result에 할당해야 합니다.

        result = String.format("현재 시각은 %s시 %s분 %s초 입니다.", hour, min, sec);

        //아래 코드는 수정하지 말아야 합니다.
        return result;
    }
}
