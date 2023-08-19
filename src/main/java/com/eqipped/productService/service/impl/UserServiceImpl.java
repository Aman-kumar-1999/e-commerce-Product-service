package com.eqipped.productService.service.impl;


import com.eqipped.productService.config.FileUpload;
import com.eqipped.productService.entities.User;
import com.eqipped.productService.repository.UserRepository;
import com.eqipped.productService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private FileUpload fileUpload;
	
	@Override
	public Map<String, Object> updateUserImage(MultipartFile images,String id){

		Map<String,Object> map = new HashMap<>();

		if (!images.isEmpty()) {
			try {
				Map<String, Object> uploadMap = fileUpload.uploadFile(images);
				map.put("File Exception: ", uploadMap.get("e"));
				boolean uploaded = (boolean) uploadMap.get("f");
				if (uploaded) {

					User oldUser = userRepository.findById(id).isPresent()
							? userRepository.findById(id).get()
							: null;
					if (oldUser != null) {

						User newUser;
						newUser = oldUser;
						newUser.setImageName(uploadMap.get("fileName").toString());
						newUser.setImagePath(uploadMap.get("filePath").toString());
						System.out.println("Before save");

						userRepository.save(newUser);

						System.out.println("After Save");
						map.put("STATUS", "SUCCESS");
						map.put("USER", newUser);

					} else {
						map.put("STATUS", "FAILED");
						map.put("MSG","User is not Present");

					}
				}else
					map.put("STATUS","FAILED");

			}catch (Exception e){
				map.put("STATUS","InternalServerError");
				map.put("EXCEPTION",e);
			}
		}

		return map;
	}

	@Override
	public Map<String, Object> updateUser(MultipartFile images,String id){

		Map<String,Object> map = new HashMap<>();

		if (!images.isEmpty()) {
			try {
				Map<String, Object> uploadMap = fileUpload.uploadFile(images);
				map.put("File Exception: ", uploadMap.get("e"));
				boolean uploaded = (boolean) uploadMap.get("f");
				if (uploaded) {

					User oldUser = userRepository.findById(id).isPresent()
							? userRepository.findById(id).get()
							: null;
					if (oldUser != null) {

						User newUser;
						newUser = oldUser;
						newUser.setImageName(uploadMap.get("fileName").toString());
						newUser.setImagePath(uploadMap.get("filePath").toString());
						System.out.println("Before save");

						userRepository.save(newUser);

						System.out.println("After Save");
						map.put("STATUS", "SUCCESS");
						map.put("USER", newUser);

					} else {
						map.put("STATUS", "FAILED");
						map.put("MSG","User is not Present");

					}
				}else
					map.put("STATUS","FAILED");

			}catch (Exception e){
				map.put("STATUS","InternalServerError");
				map.put("EXCEPTION",e);
			}
		}

		return map;
	}


}
