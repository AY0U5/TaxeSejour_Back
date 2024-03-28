package  ma.zs.sejour.ws.converter.Taxe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.sejour.ws.converter.taux.TauxTaxeSejourTrimConverter;



import ma.zs.sejour.zynerator.util.StringUtil;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.DateUtil;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;

@Component
public class TaxeSejourTrimConverter extends AbstractConverter<TaxeSejourTrim, TaxeSejourTrimDto> {

    @Autowired
    private TauxTaxeSejourTrimConverter tauxTaxeSejourTrimConverter ;
    private boolean tauxTaxeSejourTrim;

    public  TaxeSejourTrimConverter() {
        super(TaxeSejourTrim.class, TaxeSejourTrimDto.class);
        init(true);
    }

    @Override
    public TaxeSejourTrim toItem(TaxeSejourTrimDto dto) {
        if (dto == null) {
            return null;
        } else {
        TaxeSejourTrim item = new TaxeSejourTrim();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLocale()))
                item.setLocale(dto.getLocale());
            if(StringUtil.isNotEmpty(dto.getRedevable()))
                item.setRedevable(dto.getRedevable());
            if(StringUtil.isNotEmpty(dto.getNbrNuit()))
                item.setNbrNuit(dto.getNbrNuit());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getTrim()))
                item.setTrim(dto.getTrim());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(StringUtil.isNotEmpty(dto.getMontantBase()))
                item.setMontantBase(dto.getMontantBase());
            if(StringUtil.isNotEmpty(dto.getNbrMoisRetard()))
                item.setNbrMoisRetard(dto.getNbrMoisRetard());
            if(StringUtil.isNotEmpty(dto.getMontantRetard()))
                item.setMontantRetard(dto.getMontantRetard());
            if(StringUtil.isNotEmpty(dto.getMontantPremierMoisRetard()))
                item.setMontantPremierMoisRetard(dto.getMontantPremierMoisRetard());
            if(StringUtil.isNotEmpty(dto.getMontantAutreMoisRetard()))
                item.setMontantAutreMoisRetard(dto.getMontantAutreMoisRetard());
            if(StringUtil.isNotEmpty(dto.getMontantTotal()))
                item.setMontantTotal(dto.getMontantTotal());
            if(this.tauxTaxeSejourTrim && dto.getTauxTaxeSejourTrim()!=null &&  dto.getTauxTaxeSejourTrim().getId() != null)
                item.setTauxTaxeSejourTrim(tauxTaxeSejourTrimConverter.toItem(dto.getTauxTaxeSejourTrim())) ;




        return item;
        }
    }

    @Override
    public TaxeSejourTrimDto toDto(TaxeSejourTrim item) {
        if (item == null) {
            return null;
        } else {
            TaxeSejourTrimDto dto = new TaxeSejourTrimDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLocale()))
                dto.setLocale(item.getLocale());
            if(StringUtil.isNotEmpty(item.getRedevable()))
                dto.setRedevable(item.getRedevable());
            if(StringUtil.isNotEmpty(item.getNbrNuit()))
                dto.setNbrNuit(item.getNbrNuit());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getTrim()))
                dto.setTrim(item.getTrim());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
            if(StringUtil.isNotEmpty(item.getMontantBase()))
                dto.setMontantBase(item.getMontantBase());
            if(StringUtil.isNotEmpty(item.getNbrMoisRetard()))
                dto.setNbrMoisRetard(item.getNbrMoisRetard());
            if(StringUtil.isNotEmpty(item.getMontantRetard()))
                dto.setMontantRetard(item.getMontantRetard());
            if(StringUtil.isNotEmpty(item.getMontantPremierMoisRetard()))
                dto.setMontantPremierMoisRetard(item.getMontantPremierMoisRetard());
            if(StringUtil.isNotEmpty(item.getMontantAutreMoisRetard()))
                dto.setMontantAutreMoisRetard(item.getMontantAutreMoisRetard());
            if(StringUtil.isNotEmpty(item.getMontantTotal()))
                dto.setMontantTotal(item.getMontantTotal());
            if(this.tauxTaxeSejourTrim && item.getTauxTaxeSejourTrim()!=null) {
                dto.setTauxTaxeSejourTrim(tauxTaxeSejourTrimConverter.toDto(item.getTauxTaxeSejourTrim())) ;

            }


        return dto;
        }
    }

    public void copy(TaxeSejourTrimDto dto, TaxeSejourTrim t) {
    super.copy(dto, t);
    if (dto.getTauxTaxeSejourTrim() != null)
        tauxTaxeSejourTrimConverter.copy(dto.getTauxTaxeSejourTrim(), t.getTauxTaxeSejourTrim());
    }



    public void initObject(boolean value) {
        this.tauxTaxeSejourTrim = value;
    }


    public TauxTaxeSejourTrimConverter getTauxTaxeSejourTrimConverter(){
        return this.tauxTaxeSejourTrimConverter;
    }
    public void setTauxTaxeSejourTrimConverter(TauxTaxeSejourTrimConverter tauxTaxeSejourTrimConverter ){
        this.tauxTaxeSejourTrimConverter = tauxTaxeSejourTrimConverter;
    }
    public boolean  isTauxTaxeSejourTrim(){
        return this.tauxTaxeSejourTrim;
    }
    public void  setTauxTaxeSejourTrim(boolean tauxTaxeSejourTrim){
        this.tauxTaxeSejourTrim = tauxTaxeSejourTrim;
    }
}
