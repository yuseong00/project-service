package com.projectservice.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class PaginationService {

    private static final int BAR_LENGTH = 5;  //페이지 길이

    //currentPageNumber 현재페이지번호, totalPages 총페이지수
    public List<Integer> getPaginationBarNumbers(int currentPageNumber, int totalPages) {
        int startNumber = Math.max(currentPageNumber - (BAR_LENGTH / 2), 0);  //-1값 나오지 않게
        int endNumber = Math.min(startNumber + BAR_LENGTH, totalPages);    // 끝단처리

        return IntStream.range(startNumber, endNumber).boxed().toList();
    }

    public int currentBarLength() {
        return BAR_LENGTH;
    }
}