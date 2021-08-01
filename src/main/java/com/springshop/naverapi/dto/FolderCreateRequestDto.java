package com.springshop.naverapi.dto;

import lombok.Getter;
import java.util.List;

//폴더 만들떄 이름들
@Getter
public class FolderCreateRequestDto {
    List<String> folderNames;
}