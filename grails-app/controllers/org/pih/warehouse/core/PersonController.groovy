package org.pih.warehouse.core;

import groovy.sql.Sql

class PersonController {
	def userService

	def scaffold = Person;
	
		
	def convertPersonToUser = { 	
		userService.convertPersonToUser(Integer.valueOf(params.id))
		redirect(controller: "user", action: "edit", id: params.id)	
	}

	def convertUserToPerson = {
		userService.convertUserToPerson(Integer.valueOf(params.id))
		redirect(controller: "person", action: "show", id: params.id)
	}

}
