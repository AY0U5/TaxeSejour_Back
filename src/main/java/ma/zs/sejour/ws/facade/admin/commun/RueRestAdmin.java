package ma.zs.sejour.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.dao.criteria.core.commun.RueCriteria;
import ma.zs.sejour.service.facade.admin.commun.RueAdminService;
import ma.zs.sejour.ws.converter.commun.RueConverter;
import ma.zs.sejour.ws.dto.commun.RueDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

public class RueRestAdmin extends AbstractController<Rue, RueDto, RueCriteria, RueAdminService, RueConverter> {


    @Operation(summary = "find a rue by code ")
    @GetMapping("code/{code}")
    public RueDto findByCode(@PathVariable String code) {
        Rue bean = service.findByCode(code);
        return converter.toDto(bean);
    }

    @Operation(summary = "delete a Rue by code ")
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return service.deleteByCode(code);
    }

    @Operation(summary = "save a Rue by code ")
    @PostMapping("")
    public int save(@RequestBody Rue rue) {
        return service.save(rue);
    }


    public RueRestAdmin(RueAdminService service, RueConverter converter) {
        super(service, converter);
    }
}



