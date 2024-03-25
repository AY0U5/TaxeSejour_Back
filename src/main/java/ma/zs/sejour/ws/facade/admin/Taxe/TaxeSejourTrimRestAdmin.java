package  ma.zs.sejour.ws.facade.admin.Taxe;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourTrimCriteria;
import ma.zs.sejour.service.facade.admin.Taxe.TaxeSejourTrimAdminService;
import ma.zs.sejour.ws.converter.Taxe.TaxeSejourTrimConverter;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import ma.zs.sejour.zynerator.controller.AbstractController;
import ma.zs.sejour.zynerator.dto.AuditEntityDto;
import ma.zs.sejour.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.sejour.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.sejour.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/taxeSejourTrim/")
public class TaxeSejourTrimRestAdmin  extends AbstractController<TaxeSejourTrim, TaxeSejourTrimDto, TaxeSejourTrimCriteria, TaxeSejourTrimAdminService, TaxeSejourTrimConverter> {



    @Operation(summary = "upload one taxeSejourTrim")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple taxeSejourTrims")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all taxeSejourTrims")
    @GetMapping("")
    public ResponseEntity<List<TaxeSejourTrimDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  taxeSejourTrim")
    @PostMapping("")
    public ResponseEntity<TaxeSejourTrimDto> save(@RequestBody TaxeSejourTrimDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  taxeSejourTrim")
    @PutMapping("")
    public ResponseEntity<TaxeSejourTrimDto> update(@RequestBody TaxeSejourTrimDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of taxeSejourTrim")
    @PostMapping("multiple")
    public ResponseEntity<List<TaxeSejourTrimDto>> delete(@RequestBody List<TaxeSejourTrimDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified taxeSejourTrim")
    @DeleteMapping("")
    public ResponseEntity<TaxeSejourTrimDto> delete(@RequestBody TaxeSejourTrimDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified taxeSejourTrim")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple taxeSejourTrims by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by tauxTaxeSejourTrim id")
    @GetMapping("tauxTaxeSejourTrim/id/{id}")
    public List<TaxeSejourTrimDto> findByTauxTaxeSejourTrimId(@PathVariable Long id){
        return findDtos(service.findByTauxTaxeSejourTrimId(id));
    }
    @Operation(summary = "delete by tauxTaxeSejourTrim id")
    @DeleteMapping("tauxTaxeSejourTrim/id/{id}")
    public int deleteByTauxTaxeSejourTrimId(@PathVariable Long id){
        return service.deleteByTauxTaxeSejourTrimId(id);
    }

    @Operation(summary = "Finds a taxeSejourTrim and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TaxeSejourTrimDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds taxeSejourTrims by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TaxeSejourTrimDto>> findByCriteria(@RequestBody TaxeSejourTrimCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated taxeSejourTrims by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TaxeSejourTrimCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports taxeSejourTrims by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TaxeSejourTrimCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets taxeSejourTrim data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TaxeSejourTrimCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TaxeSejourTrimRestAdmin (TaxeSejourTrimAdminService service, TaxeSejourTrimConverter converter) {
        super(service, converter);
    }




}
