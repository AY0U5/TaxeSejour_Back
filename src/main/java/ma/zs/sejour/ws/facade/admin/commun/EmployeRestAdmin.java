package ma.zs.sejour.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.service.facade.admin.commun.EmployeAdminService;
import ma.zs.sejour.ws.converter.commun.EmployeConverter;
import ma.zs.sejour.ws.dto.commun.EmployeDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

public class EmployeRestAdmin extends AbstractController<Employe, EmployeDto, EmployeCriteria, EmployeAdminService, EmployeConverter> {


    @Operation(summary = "find an employe by code")
    @GetMapping("code/{code}")
    public EmployeDto findByCode(@PathVariable String code) {
        Employe bean = service.findByCode(code);
        return converter.toDto(bean);
    }

    @Operation(summary = "delete an employe by code ")
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return service.deleteByCode(code);
    }

    @Operation(summary = "save an employe ")
    @PostMapping("")
    public int save(@RequestBody EmployeDto employe) {
        return service.save(converter.toItem(employe));
    }


    public EmployeRestAdmin(EmployeAdminService service, EmployeConverter converter) {
        super(service, converter);
    }

}
