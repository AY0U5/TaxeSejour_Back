package ma.zs.sejour.ws.facade.admin.Etat;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.Etat.EtatTaxeSejour;
import ma.zs.sejour.dao.criteria.core.etat.EtatTaxeSejourCriteria;
import ma.zs.sejour.service.facade.admin.etat.EtatTaxeSejourAdminService;
import ma.zs.sejour.ws.converter.etat.EtatTaxeSejourConverter;
import ma.zs.sejour.ws.dto.etat.EtatTaxeSejourDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

public class EtatTaxeSejourRestAdmin extends AbstractController<EtatTaxeSejour, EtatTaxeSejourDto, EtatTaxeSejourCriteria, EtatTaxeSejourAdminService, EtatTaxeSejourConverter> {


    @Operation(summary = "find a EtatTaxeSejour by code ")
    @GetMapping("code/{code}")
    public EtatTaxeSejourDto findBycode(@PathVariable String code) {
        EtatTaxeSejour bean = service.findBycode(code);
        return converter.toDto(bean);
    }

    @Operation(summary = "delete a EtatTaxeSejour by code ")
    @DeleteMapping("code/{code}")
    public int deleteBycode(@PathVariable String code) {
        return service.deleteBycode(code);
    }

    @Operation(summary = "save a EtatTaxeSejour by code ")
    @PostMapping("")
    public int save(@RequestBody EtatTaxeSejour etatTaxeSejour) {
        return service.save(etatTaxeSejour);
    }


    public EtatTaxeSejourRestAdmin(EtatTaxeSejourAdminService service, EtatTaxeSejourConverter converter) {
        super(service, converter);
    }
}
