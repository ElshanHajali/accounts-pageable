package az.company.accounts.excetion.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionResponse {

    private String code;

    private String message;

}
