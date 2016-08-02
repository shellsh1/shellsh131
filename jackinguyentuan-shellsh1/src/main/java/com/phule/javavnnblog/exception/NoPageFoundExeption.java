/**
 * 
 */
package com.phule.javavnnblog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author MrPhu
 *
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Kh�ng c� trang n�y!")
public class NoPageFoundExeption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5714829403640116757L;

}
