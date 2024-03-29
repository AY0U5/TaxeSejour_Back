package ma.zs.sejour.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.dao.criteria.core.commun.VilleCriteria;
import ma.zs.sejour.service.facade.admin.commun.VilleAdminService;
import ma.zs.sejour.ws.converter.commun.VilleConverter;
import ma.zs.sejour.ws.dto.commun.VilleDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

public class VilleRestAdmin extends AbstractController<Ville, VilleDto, VilleCriteria, VilleAdminService, VilleConverter> {


    @Operation(summary = "find a Ville by code ")
    @GetMapping("code/{code}")
    public VilleDto findBycode(@PathVariable String code) {
        Ville ty = service.findBycode(code);
        return converter.toDto(ty);
    }

    @Operation(summary = "delete a Ville by code ")
    @DeleteMapping("code/{code}")
    public int deleteBycode(@PathVariable String code) {

        return service.deleteBycode(code);
    }

    @Operation(summary = "save a Ville by code ")
    @PostMapping("")
    public int save(@RequestBody Ville ville) {
        return service.save(ville);
    }


    public VilleRestAdmin(VilleAdminService service, VilleConverter converter) {
        super(service, converter);
    }
}
