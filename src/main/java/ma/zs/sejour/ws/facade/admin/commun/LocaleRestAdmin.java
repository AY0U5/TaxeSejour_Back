package ma.zs.sejour.ws.facade.admin.commun;


import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.dao.criteria.core.commun.LocaleCriteria;
import ma.zs.sejour.service.facade.admin.commun.EmployeAdminService;
import ma.zs.sejour.service.facade.admin.commun.LocaleAdminService;
import ma.zs.sejour.ws.converter.commun.EmployeConverter;
import ma.zs.sejour.ws.converter.commun.LocalConverter;
import ma.zs.sejour.ws.dto.commun.EmployeDto;
import ma.zs.sejour.ws.dto.commun.LocaleDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

public class LocaleRestAdmin extends AbstractController<Locale, LocaleDto, LocaleCriteria, LocaleAdminService, LocalConverter> {

    @Operation(summary = "find a local by code ")
    @GetMapping("code/{code}")
    public Locale findByCode(@PathVariable String code) {

        return service.findByCode(code);
    }

    @Operation(summary = "delete a locale by code ")
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return service.deleteByCode(code);
    }

    @Operation(summary = "save a local")
    @PostMapping("")
    public int save(@RequestBody Locale locale) {
        return service.save(locale);
    }


    public LocaleRestAdmin(LocaleAdminService service, LocalConverter converter) {
        super(service, converter);
    }
}
