package  ma.zs.sejour.ws.converter.Taxe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.sejour.ws.converter.Taxe.TaxeSejourAnnuelConverter;



import ma.zs.sejour.zynerator.util.StringUtil;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.DateUtil;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourAnnuelDetailDto;

@Component
public class TaxeSejourAnnuelDetailConverter extends AbstractConverter<TaxeSejourAnnuelDetail, TaxeSejourAnnuelDetailDto> {

    @Autowired
    private TaxeSejourAnnuelConverter taxeSejourAnnuelConverter ;
    private boolean taxeSejourAnnuel;

    public  TaxeSejourAnnuelDetailConverter() {
        super(TaxeSejourAnnuelDetail.class, TaxeSejourAnnuelDetailDto.class);
        init(true);
    }

    @Override
    public TaxeSejourAnnuelDetail toItem(TaxeSejourAnnuelDetailDto dto) {
        if (dto == null) {
            return null;
        } else {
        TaxeSejourAnnuelDetail item = new TaxeSejourAnnuelDetail();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNbrNuit()))
                item.setNbrNuit(dto.getNbrNuit());
            if(StringUtil.isNotEmpty(dto.getTrim()))
                item.setTrim(dto.getTrim());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(this.taxeSejourAnnuel && dto.getTaxeSejourAnnuel()!=null &&  dto.getTaxeSejourAnnuel().getId() != null)
                item.setTaxeSejourAnnuel(taxeSejourAnnuelConverter.toItem(dto.getTaxeSejourAnnuel())) ;
        return item;
        }
    }

    @Override
    public TaxeSejourAnnuelDetailDto toDto(TaxeSejourAnnuelDetail item) {
        if (item == null) {
            return null;
        } else {
            TaxeSejourAnnuelDetailDto dto = new TaxeSejourAnnuelDetailDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNbrNuit()))
                dto.setNbrNuit(item.getNbrNuit());
            if(StringUtil.isNotEmpty(item.getTrim()))
                dto.setTrim(item.getTrim());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
            if(this.taxeSejourAnnuel && item.getTaxeSejourAnnuel()!=null) {
                dto.setTaxeSejourAnnuel(taxeSejourAnnuelConverter.toDto(item.getTaxeSejourAnnuel())) ;

            }


        return dto;
        }
    }

    public void copy(TaxeSejourAnnuelDetailDto dto, TaxeSejourAnnuelDetail t) {
    super.copy(dto, t);
    if (dto.getTaxeSejourAnnuel() != null)
        taxeSejourAnnuelConverter.copy(dto.getTaxeSejourAnnuel(), t.getTaxeSejourAnnuel());
    }



    public void initObject(boolean value) {
        this.taxeSejourAnnuel = value;
    }


    public TaxeSejourAnnuelConverter getTaxeSejourAnnuelConverter(){
        return this.taxeSejourAnnuelConverter;
    }
    public void setTaxeSejourAnnuelConverter(TaxeSejourAnnuelConverter taxeSejourAnnuelConverter ){
        this.taxeSejourAnnuelConverter = taxeSejourAnnuelConverter;
    }
    public boolean  isTaxeSejourAnnuel(){
        return this.taxeSejourAnnuel;
    }
    public void  setTaxeSejourAnnuel(boolean taxeSejourAnnuel){
        this.taxeSejourAnnuel = taxeSejourAnnuel;
    }
}
