package ma.zs.sejour.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.dao.criteria.core.commun.CategorieSejourCriteria;
import ma.zs.sejour.service.facade.admin.commun.CategorieSejourAdminService;
import ma.zs.sejour.ws.converter.commun.CategorieSejourConverter;
import ma.zs.sejour.ws.dto.commun.CategorieSejourDto;

import ma.zs.sejour.zynerator.controller.AbstractController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/categoriesejour/")
public class CategorieSejourRestAdmin extends AbstractController<CategorieSejour, CategorieSejourDto, CategorieSejourCriteria, CategorieSejourAdminService, CategorieSejourConverter> {

    @Operation(summary = "create a categorie sejour")
    @PostMapping("")
    public CategorieSejour create(CategorieSejour categorieSejour) {
        return service.create(categorieSejour);
    }

    @Operation(summary = "find a categorie by code ")
    @GetMapping("code/{code}")
    public CategorieSejourDto findByCode(@PathVariable String code) {
        CategorieSejour bean = service.findByCode(code);
        return converter.toDto(bean);
    }


    @Operation(summary = "delete a categorie")
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return service.deleteByCode(code);
    }


    @Operation(summary = "save a Categorie")
    @PostMapping("")
    public int save(@RequestBody CategorieSejourDto dto) {
        CategorieSejour bean = converter.toItem(dto);
        return service.save(bean);
    }

    @Operation(summary = "update a categorie sejour")
    @PutMapping("")
    public CategorieSejour update(@RequestBody CategorieSejour categorieSejour) {
        return service.update(categorieSejour);
    }

    @Operation(summary = "update multiple categorie sejours")
    @PutMapping("")
    public List<CategorieSejour> update(List<CategorieSejour> categorieSejours, boolean createIfNotExist) {
        return service.update(categorieSejours, createIfNotExist);
    }


    @Operation(summary = "find or save a categorie sejour")
    @PostMapping("")
    public CategorieSejour findOrSave(CategorieSejour categorieSejour) {
        return service.findOrSave(categorieSejour);
    }


    public CategorieSejourRestAdmin(CategorieSejourAdminService service, CategorieSejourConverter converter) {
        super(service, converter);
    }

}
