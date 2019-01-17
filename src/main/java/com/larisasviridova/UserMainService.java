package com.larisasviridova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMainService {
    @Autowired
    TestManyEntityRepository testManyEntityRepository;
}
