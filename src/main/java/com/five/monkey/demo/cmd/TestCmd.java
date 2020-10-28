package com.five.monkey.demo.cmd;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author jim
 * @date 2020/10/28 11:47
 */
@Data
@ToString
public class TestCmd {

    @NotBlank(message = "name must not be blank")
    @Size(min = 1, max = 10, message = "name.length must be in [1,10]")
    private String name;

    @Min(value = 18L, message = "age must be higher or equal 18")
    @Max(value = 28L, message = "age must be lower or equal 28")
    private int age;

    @NotBlank(message = "idNo must not be blank")
    @Size(min = 18, max = 18, message = "idNo.length must be 18")
    private String idNo;

    @NotEmpty(message = "hobby must not be empty")
    @Size(min = 1, max = 3, message = "hobby.size must be in [1,3]")
    private List<String> hobby;
}
