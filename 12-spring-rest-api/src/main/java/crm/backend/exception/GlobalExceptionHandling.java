package crm.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleNotFoundException(ElementNotFoundException enfe) {
		CustomErrorResponse response = new CustomErrorResponse(
				HttpStatus.NOT_FOUND.value(), enfe.getMessage(), CustomErrorResponse.now("yyyy-MM-dd.'T'HH:mm:ss"));
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleException(Exception exception) {
		CustomErrorResponse response = new CustomErrorResponse(
				HttpStatus.BAD_REQUEST.value(), exception.getMessage(), CustomErrorResponse.now("yyyy-MM-dd.'T'HH:mm:ss"));
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
	// Handle Exception, Validation
	// FrontEnd: JQuery, Angular
	// BackEnd: Java, Spring
	// Persistent: JPA/Hibernate
	// Database
}
