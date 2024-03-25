package  ma.zs.sejour.ws.facade.admin.Taxe;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourAnnuelDetailCriteria;
import ma.zs.sejour.service.facade.admin.Taxe.TaxeSejourAnnuelDetailAdminService;
import ma.zs.sejour.ws.converter.Taxe.TaxeSejourAnnuelDetailConverter;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourAnnuelDetailDto;
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
@RequestMapping("/api/admin/taxeSejourAnnuelDetail/")
public class TaxeSejourAnnuelDetailRestAdmin  extends AbstractController<TaxeSejourAnnuelDetail, TaxeSejourAnnuelDetailDto, TaxeSejourAnnuelDetailCriteria, TaxeSejourAnnuelDetailAdminService, TaxeSejourAnnuelDetailConverter> {



    @Operation(summary = "upload one taxeSejourAnnuelDetail")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple taxeSejourAnnuelDetails")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all taxeSejourAnnuelDetails")
    @GetMapping("")
    public ResponseEntity<List<TaxeSejourAnnuelDetailDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  taxeSejourAnnuelDetail")
    @PostMapping("")
    public ResponseEntity<TaxeSejourAnnuelDetailDto> save(@RequestBody TaxeSejourAnnuelDetailDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  taxeSejourAnnuelDetail")
    @PutMapping("")
    public ResponseEntity<TaxeSejourAnnuelDetailDto> update(@RequestBody TaxeSejourAnnuelDetailDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of taxeSejourAnnuelDetail")
    @PostMapping("multiple")
    public ResponseEntity<List<TaxeSejourAnnuelDetailDto>> delete(@RequestBody List<TaxeSejourAnnuelDetailDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified taxeSejourAnnuelDetail")
    @DeleteMapping("")
    public ResponseEntity<TaxeSejourAnnuelDetailDto> delete(@RequestBody TaxeSejourAnnuelDetailDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified taxeSejourAnnuelDetail")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple taxeSejourAnnuelDetails by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by taxeSejourAnnuel id")
    @GetMapping("taxeSejourAnnuel/id/{id}")
    public List<TaxeSejourAnnuelDetailDto> findByTaxeSejourAnnuelId(@PathVariable Long id){
        return findDtos(service.findByTaxeSejourAnnuelId(id));
    }
    @Operation(summary = "delete by taxeSejourAnnuel id")
    @DeleteMapping("taxeSejourAnnuel/id/{id}")
    public int deleteByTaxeSejourAnnuelId(@PathVariable Long id){
        return service.deleteByTaxeSejourAnnuelId(id);
    }

    @Operation(summary = "Finds a taxeSejourAnnuelDetail and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TaxeSejourAnnuelDetailDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds taxeSejourAnnuelDetails by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TaxeSejourAnnuelDetailDto>> findByCriteria(@RequestBody TaxeSejourAnnuelDetailCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated taxeSejourAnnuelDetails by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TaxeSejourAnnuelDetailCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports taxeSejourAnnuelDetails by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TaxeSejourAnnuelDetailCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets taxeSejourAnnuelDetail data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TaxeSejourAnnuelDetailCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TaxeSejourAnnuelDetailRestAdmin (TaxeSejourAnnuelDetailAdminService service, TaxeSejourAnnuelDetailConverter converter) {
        super(service, converter);
    }




}
