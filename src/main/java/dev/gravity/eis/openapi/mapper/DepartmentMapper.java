package dev.gravity.eis.openapi.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.Department;

//
@Mapper (componentModel   = "spring")
public interface DepartmentMapper {

    Department toDto(Department department);


    dev.gravity.eis.openapi.entity.Department totEntity(Department departmentDto);
}
