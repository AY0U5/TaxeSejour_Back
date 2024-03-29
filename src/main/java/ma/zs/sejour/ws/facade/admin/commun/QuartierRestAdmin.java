package ma.zs.sejour.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.dao.criteria.core.commun.QuartierCriteria;
import ma.zs.sejour.service.facade.admin.commun.QuartierAdminService;
import ma.zs.sejour.ws.converter.commun.QuatierConverter;
import ma.zs.sejour.ws.dto.commun.QuartierDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class QuartierRestAdmin extends AbstractController<Quartier, QuartierDto, QuartierCriteria, QuartierAdminService, QuatierConverter> {

    @Operation(summary = "find a list of quartier by code secteur ")
    @GetMapping("code/{code}")
    public List<Quartier> findBySecteurCode(@PathVariable String code) {
        return service.findBySecteurCode(code);
    }

    @Operation(summary = "find Quartier by code")
    @GetMapping("code/{code}")
    public QuartierDto findByCode(@PathVariable String code) {
        Quartier bean = service.findBycode(code);
        return converter.toDto(bean);
    }

    @Operation(summary = "delete a Quartier by code ")
    @DeleteMapping("code/{code}")
    public int deleteBycode(@PathVariable String code) {
        return service.deleteBycode(code);
    }

    @Operation(summary = "save a Quartier by code ")
    @PostMapping("")
    public int save(@RequestBody Quartier quartier) {
        return service.save(quartier);
    }

    public QuartierRestAdmin(QuartierAdminService service, QuatierConverter converter) {
        super(service, converter);
    }
}
