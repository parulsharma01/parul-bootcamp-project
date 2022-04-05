package com.parul.bootcamp.project.service;

import com.parul.bootcamp.project.dto.CustomerDTO;
import com.parul.bootcamp.project.dto.SellerDTO;
import com.parul.bootcamp.project.entities.Customer;
import com.parul.bootcamp.project.entities.Seller;
import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.exceptions.BadRequestException;
import com.parul.bootcamp.project.repos.CustomerRepository;
import com.parul.bootcamp.project.repos.SellerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;

    @Autowired
    ModelMapper modelMapper;

    public Seller registerSeller(SellerDTO sellerDTO)
    {
        User user = modelMapper.map(sellerDTO, User.class);
        Seller seller = modelMapper.map(sellerDTO, Seller.class);
        seller.setUser(user);
        return sellerRepository.save(seller);
    }


}

