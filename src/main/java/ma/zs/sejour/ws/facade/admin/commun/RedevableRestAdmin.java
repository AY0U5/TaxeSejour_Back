package ma.zs.sejour.ws.facade.admin.commun;


import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.dao.criteria.core.commun.RedevableCriteria;
import ma.zs.sejour.service.facade.admin.commun.RedevableAdminService;
import ma.zs.sejour.ws.converter.commun.RedevableConverter;
import ma.zs.sejour.ws.dto.commun.RedevableDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

public class RedevableRestAdmin extends AbstractController<Redevable, RedevableDto, RedevableCriteria, RedevableAdminService, RedevableConverter> {


    @Operation(summary = "find a redevable by code ")
    @GetMapping("code/{code}")
    public RedevableDto findByCode(@PathVariable String code) {
        Redevable redevable = service.findByCode(code);
        return converter.toDto(redevable);
    }

    @Operation(summary = "delete a redevable by code ")
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return service.deleteByCode(code);

    }

    @Operation(summary = "delete a redevable by type redevable code ")
    @DeleteMapping("typeredevable/code/{code}")
    public int deleteByTypeRedevableCode(@PathVariable String code) {
        return service.deleteByTypeRedevableCode(code);
    }

    @Operation(summary = "save a redevable")
    @PostMapping("")
    public int save(@RequestBody RedevableDto redevable) {
        return service.save(converter.toItem(redevable));
    }


    public RedevableRestAdmin(RedevableAdminService service, RedevableConverter converter) {
        super(service, converter);
    }

}
