package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {

	/**
	 * Guarda y actualiza un usuario
	 * @param user
	 * @return
	 */
	User saveUser(User user);
	
	/**
	 * Recupera la lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> getUsers();
	
	/**
	 * Elimina un usuario con el id recibido
	 * @param id
	 */
	void deleteUser(Long id);

}
