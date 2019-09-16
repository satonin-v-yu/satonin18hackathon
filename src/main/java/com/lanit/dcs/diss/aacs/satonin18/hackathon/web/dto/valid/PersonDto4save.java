package com.lanit.dcs.diss.aacs.satonin18.hackathon.web.dto.valid;

import com.lanit.dcs.diss.aacs.satonin18.hackathon.web.helper.PropertiesApp;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;

//todo validation
/*
JSON, представляющий объект Person
{
id: Long (not null),
name: String (not null),
birthdate: Date (not null,формат dd.MM.yyyy),
}

Все поля удовлетворяют ограничениям на тип и формат
Дата рождения в прошлом
Дата рождения в нужном формате
Ранее валидный объект с таким id не передавался
*/

// todo ограничения БД
// TODO SET VALIDATOR

@Data
@NoArgsConstructor
public class PersonDto4save {

    @NotNull
    Long id;

    @NotNull
//    @NotBlank
    @Size(min = 1, max = 100)
    String name;

//    @NotNull

//    @DateTimeFormat(PropertiesApp.DATA_FORMAT_BIRTHDATE)
//    java.sql.Date birthdate;

    @NotNull
//    @NotBlank
//    @Pattern(regexp = )
    String birthdate;//todo + PropertiesApp.DATA_FORMAT_BIRTHDATE
}
