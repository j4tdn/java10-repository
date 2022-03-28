package com.springsecurity.dao;

import com.springsecurity.entity.Role;

public interface RoleDao {

	Role findRoleByRoleName(String roleName);
	
}
