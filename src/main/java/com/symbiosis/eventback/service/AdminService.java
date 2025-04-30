package com.symbiosis.eventback.service;

import com.symbiosis.eventback.model.Admin;

public interface AdminService {
 Admin save(Admin a);
 Admin login(String em,String ps);
}
