package  ma.zs.sejour.ws.facade.admin.taux;

import io.swagger.v3.oas.annotations.Operation;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;
import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourAnnuelCriteria;
import ma.zs.sejour.service.facade.admin.taux.TauxTaxeSejourAnnuelAdminService;
import ma.zs.sejour.ws.converter.taux.TauxTaxeSejourAnnuelConverter;
import ma.zs.sejour.ws.dto.taux.TauxTaxeSejourAnnuelDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import ma.zs.sejour.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.sejour.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/tauxTaxeSejourAnnuel/")
public class TauxTaxeSejourAnnuelRestAdmin  extends AbstractController<TauxTaxeSejourAnnuel, TauxTaxeSejourAnnuelDto, TauxTaxeSejourAnnuelCriteria, TauxTaxeSejourAnnuelAdminService, TauxTaxeSejourAnnuelConverter> {



    @Operation(summary = "upload one tauxTaxeSejourAnnuel")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple tauxTaxeSejourAnnuels")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all tauxTaxeSejourAnnuels")
    @GetMapping("")
    public ResponseEntity<List<TauxTaxeSejourAnnuelDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  tauxTaxeSejourAnnuel")
    @PostMapping("")
    public int save(@RequestBody TauxTaxeSejourAnnuelDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  tauxTaxeSejourAnnuel")
    @PutMapping("")
    public ResponseEntity<TauxTaxeSejourAnnuelDto> update(@RequestBody TauxTaxeSejourAnnuelDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of tauxTaxeSejourAnnuel")
    @PostMapping("multiple")
    public ResponseEntity<List<TauxTaxeSejourAnnuelDto>> delete(@RequestBody List<TauxTaxeSejourAnnuelDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified tauxTaxeSejourAnnuel")
    @DeleteMapping("")
    public ResponseEntity<TauxTaxeSejourAnnuelDto> delete(@RequestBody TauxTaxeSejourAnnuelDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified tauxTaxeSejourAnnuel")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple tauxTaxeSejourAnnuels by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }



    @Operation(summary = "Finds a tauxTaxeSejourAnnuel and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TauxTaxeSejourAnnuelDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds tauxTaxeSejourAnnuels by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TauxTaxeSejourAnnuelDto>> findByCriteria(@RequestBody TauxTaxeSejourAnnuelCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated tauxTaxeSejourAnnuels by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TauxTaxeSejourAnnuelCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports tauxTaxeSejourAnnuels by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TauxTaxeSejourAnnuelCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets tauxTaxeSejourAnnuel data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TauxTaxeSejourAnnuelCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TauxTaxeSejourAnnuelRestAdmin (TauxTaxeSejourAnnuelAdminService service, TauxTaxeSejourAnnuelConverter converter) {
        super(service, converter);
    }




}
