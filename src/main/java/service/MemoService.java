package service;

import domain.Memo;
import domain.MemoRepository;
import models.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final MemoRepository memoRepository;
    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {

        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException(" .")
        ); memo.update(requestDto); return memo.getId();
    } }