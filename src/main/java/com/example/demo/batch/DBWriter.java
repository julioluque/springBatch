package com.example.demo.batch;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.repository.UserRespository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DBWriter implements ItemWriter<User> {

	@Autowired
	private UserRespository userRespository;

	@Override
	public void write(List<? extends User> users) throws Exception {

		System.out.println("Data Saved for Users" + users);
		userRespository.saveAll(users);
//		userRespository.save(users);

	}

}
