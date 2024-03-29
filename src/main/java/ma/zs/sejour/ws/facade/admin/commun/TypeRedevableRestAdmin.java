package ma.zs.sejour.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.dao.criteria.core.commun.TypeRedevableCriteria;
import ma.zs.sejour.service.facade.admin.commun.TypeRedevableAdminService;
import ma.zs.sejour.ws.converter.commun.TypeRedevableConverter;
import ma.zs.sejour.ws.dto.commun.TypeRedevableDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

public class TypeRedevableRestAdmin extends AbstractController<TypeRedevable, TypeRedevableDto, TypeRedevableCriteria, TypeRedevableAdminService, TypeRedevableConverter> {


    @Operation(summary = "find a TypeRedevable by code ")
    @GetMapping("code/{code}")
    public TypeRedevableDto findByCode(@PathVariable String code) {
        TypeRedevable ty = service.findByCode(code);
        return converter.toDto(ty);
    }

    @Operation(summary = "delete a TypeRedevable by code ")
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return service.deleteByCode(code);
    }

    @Operation(summary = "save a TypeRedevable by code ")
    @PostMapping("")
    public int save(@RequestBody TypeRedevableDto typeRedevable) {
        return service.save(converter.toItem(typeRedevable));
    }


    public TypeRedevableRestAdmin(TypeRedevableAdminService service, TypeRedevableConverter converter) {
        super(service, converter);
    }
}
