package  ma.zs.sejour.ws.facade.admin.taux;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourTrimCriteria;
import ma.zs.sejour.service.facade.admin.taux.TauxTaxeSejourTrimAdminService;
import ma.zs.sejour.ws.converter.taux.TauxTaxeSejourTrimConverter;
import ma.zs.sejour.ws.dto.taux.TauxTaxeSejourTrimDto;
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
@RequestMapping("/api/admin/tauxTaxeSejourTrim/")
public class TauxTaxeSejourTrimRestAdmin  extends AbstractController<TauxTaxeSejourTrim, TauxTaxeSejourTrimDto, TauxTaxeSejourTrimCriteria, TauxTaxeSejourTrimAdminService, TauxTaxeSejourTrimConverter> {



    @Operation(summary = "upload one tauxTaxeSejourTrim")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple tauxTaxeSejourTrims")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all tauxTaxeSejourTrims")
    @GetMapping("")
    public ResponseEntity<List<TauxTaxeSejourTrimDto>> findAll() throws Exception {
        return super.findAll();
    }



    @Operation(summary = "Saves the specified  tauxTaxeSejourTrim")
    @PostMapping("")
    public ResponseEntity<TauxTaxeSejourTrimDto> save(@RequestBody TauxTaxeSejourTrimDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  tauxTaxeSejourTrim")
    @PutMapping("")
    public ResponseEntity<TauxTaxeSejourTrimDto> update(@RequestBody TauxTaxeSejourTrimDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of tauxTaxeSejourTrim")
    @PostMapping("multiple")
    public ResponseEntity<List<TauxTaxeSejourTrimDto>> delete(@RequestBody List<TauxTaxeSejourTrimDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified tauxTaxeSejourTrim")
    @DeleteMapping("")
    public ResponseEntity<TauxTaxeSejourTrimDto> delete(@RequestBody TauxTaxeSejourTrimDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified tauxTaxeSejourTrim")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple tauxTaxeSejourTrims by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }



    @Operation(summary = "Finds a tauxTaxeSejourTrim and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TauxTaxeSejourTrimDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds tauxTaxeSejourTrims by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TauxTaxeSejourTrimDto>> findByCriteria(@RequestBody TauxTaxeSejourTrimCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated tauxTaxeSejourTrims by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TauxTaxeSejourTrimCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports tauxTaxeSejourTrims by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TauxTaxeSejourTrimCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets tauxTaxeSejourTrim data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TauxTaxeSejourTrimCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TauxTaxeSejourTrimRestAdmin (TauxTaxeSejourTrimAdminService service, TauxTaxeSejourTrimConverter converter) {
        super(service, converter);
    }




}
