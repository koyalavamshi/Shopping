package exception;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericException extends RuntimeException{
private static final Logger log = (Logger) LoggerFactory.getLogger(GenericException.class);
  public GenericException(String message){
          super(message);
          log.error(message);
  }


}
