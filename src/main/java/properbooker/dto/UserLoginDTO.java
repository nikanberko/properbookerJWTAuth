package properbooker.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserLoginDTO {

    @ApiModelProperty(position = 0)
    private String username;
    @ApiModelProperty(position = 2)
    private String password;

}