package com.spring.service;

// Initial Bean via Factory method
public class ClientService {
	private ClientService() {
	}

	private static ClientService clientService;

	public static ClientService getInstance() {
		if (clientService == null) {
			clientService = new ClientService();
		}
		return clientService;
	}
	
	public void clientInfo() {
		System.out.println(">> Info of Client - ATZ");
	}
}
