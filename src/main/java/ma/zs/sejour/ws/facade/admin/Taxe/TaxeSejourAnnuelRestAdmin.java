package  ma.zs.sejour.ws.facade.admin.Taxe;

import io.swagger.v3.oas.annotations.Operation;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourAnnuelCriteria;
import ma.zs.sejour.service.facade.admin.Taxe.TaxeSejourAnnuelAdminService;
import ma.zs.sejour.ws.converter.Taxe.TaxeSejourAnnuelConverter;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourAnnuelDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import ma.zs.sejour.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.sejour.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/taxeSejourAnnuel/")
public class TaxeSejourAnnuelRestAdmin  extends AbstractController<TaxeSejourAnnuel, TaxeSejourAnnuelDto, TaxeSejourAnnuelCriteria, TaxeSejourAnnuelAdminService, TaxeSejourAnnuelConverter> {



    @Operation(summary = "upload one taxeSejourAnnuel")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple taxeSejourAnnuels")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all taxeSejourAnnuels")
    @GetMapping("")
    public ResponseEntity<List<TaxeSejourAnnuelDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  taxeSejourAnnuel")
    @PostMapping("")
    public int save(@RequestBody TaxeSejourAnnuelDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  taxeSejourAnnuel")
    @PutMapping("")
    public ResponseEntity<TaxeSejourAnnuelDto> update(@RequestBody TaxeSejourAnnuelDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of taxeSejourAnnuel")
    @PostMapping("multiple")
    public ResponseEntity<List<TaxeSejourAnnuelDto>> delete(@RequestBody List<TaxeSejourAnnuelDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified taxeSejourAnnuel")
    @DeleteMapping("")
    public ResponseEntity<TaxeSejourAnnuelDto> delete(@RequestBody TaxeSejourAnnuelDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified taxeSejourAnnuel")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple taxeSejourAnnuels by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by tauxTaxeSejourAnnuel id")
    @GetMapping("tauxTaxeSejourAnnuel/id/{id}")
    public List<TaxeSejourAnnuelDto> findByTauxTaxeSejourAnnuelId(@PathVariable Long id){
        return findDtos(service.findByTauxTaxeSejourAnnuelId(id));
    }
    @Operation(summary = "delete by tauxTaxeSejourAnnuel id")
    @DeleteMapping("tauxTaxeSejourAnnuel/id/{id}")
    public int deleteByTauxTaxeSejourAnnuelId(@PathVariable Long id){
        return service.deleteByTauxTaxeSejourAnnuelId(id);
    }

    @Operation(summary = "Finds a taxeSejourAnnuel and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TaxeSejourAnnuelDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds taxeSejourAnnuels by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TaxeSejourAnnuelDto>> findByCriteria(@RequestBody TaxeSejourAnnuelCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated taxeSejourAnnuels by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TaxeSejourAnnuelCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports taxeSejourAnnuels by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TaxeSejourAnnuelCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets taxeSejourAnnuel data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TaxeSejourAnnuelCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TaxeSejourAnnuelRestAdmin (TaxeSejourAnnuelAdminService service, TaxeSejourAnnuelConverter converter) {
        super(service, converter);
    }




}
