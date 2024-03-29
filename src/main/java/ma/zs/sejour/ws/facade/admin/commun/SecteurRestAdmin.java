package ma.zs.sejour.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.dao.criteria.core.commun.SecteurCriteria;
import ma.zs.sejour.service.facade.admin.commun.SecteurAdminService;
import ma.zs.sejour.ws.converter.commun.SecteurConverter;
import ma.zs.sejour.ws.dto.commun.SecteurDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

public class SecteurRestAdmin extends AbstractController<Secteur, SecteurDto, SecteurCriteria, SecteurAdminService, SecteurConverter> {


    @Operation(summary = "find a Secteur by code ")
    @GetMapping("code/{code}")
    public SecteurDto findByCode(@PathVariable String code) {
        Secteur bean = service.findByCode(code);
        return converter.toDto(bean);
    }

    @Operation(summary = "delete a Secteur by code ")
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return service.deleteByCode(code);
    }

    @Operation(summary = "save a Secteur by code ")
    @PostMapping("")
    public int save(@RequestBody SecteurDto secteur) {
        return service.save(converter.toItem(secteur));
    }

    public SecteurRestAdmin(SecteurAdminService service, SecteurConverter converter) {
        super(service, converter);
    }
}


