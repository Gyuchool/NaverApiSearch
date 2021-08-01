package com.springshop.naverapi.controller;

import com.springshop.naverapi.dto.FolderCreateRequestDto;
import com.springshop.naverapi.models.Folder;
import com.springshop.naverapi.security.UserDetailsImpl;
import com.springshop.naverapi.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class FolderController {
    // 멤버 변수 선언
    private final FolderService folderService;

    @Autowired
    public FolderController(FolderService folderService) {
        // 멤버 변수 생성
        this.folderService = folderService;
    }

    // 회원이 등록한 모든 폴더 조회
    @GetMapping("/api/folders")
    public List<Folder> getFolders(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return folderService.getFolders(userDetails.getUser());
    }

    // 회원이 폴더 추가
    @PostMapping("/api/folders")
    public List<Folder> addFolders(@RequestBody FolderCreateRequestDto folderCreateRequestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        List<String> folderNames = folderCreateRequestDto.getFolderNames();
        return folderService.createFolders(folderNames, userDetails.getUser());
    }
}