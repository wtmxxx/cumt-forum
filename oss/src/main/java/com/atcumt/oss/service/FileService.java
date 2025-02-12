package com.atcumt.oss.service;

import com.atcumt.model.oss.dto.FileInfoDTO;
import com.atcumt.model.oss.vo.FileInfoVO;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {
    // 上传文件并返回文件信息
    FileInfoVO uploadFile(MultipartFile file) throws Exception;

    FileInfoVO uploadAllFile(MultipartFile file) throws Exception;

    List<FileInfoVO> uploadAllFiles(List<MultipartFile> files) throws Exception;

    FileInfoVO uploadMediaFile(MultipartFile file) throws Exception;

    List<FileInfoVO> uploadMediaFiles(List<MultipartFile> files) throws Exception;

    FileInfoVO uploadAvatar(MultipartFile file) throws Exception;

    void getFile(HttpServletResponse response, String bucket, String filename);

    void downloadFile(HttpServletResponse response, String bucket, String filename);

    void deleteFile(FileInfoDTO fileInfoDTO) throws Exception;

    void deleteFiles(List<FileInfoDTO> fileInfoDTOs);
}
