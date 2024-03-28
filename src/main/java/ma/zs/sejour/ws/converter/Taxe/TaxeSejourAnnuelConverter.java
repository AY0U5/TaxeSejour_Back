package  ma.zs.sejour.ws.converter.Taxe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.sejour.ws.converter.taux.TauxTaxeSejourAnnuelConverter;



import ma.zs.sejour.zynerator.util.StringUtil;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.DateUtil;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourAnnuelDto;

@Component
public class TaxeSejourAnnuelConverter extends AbstractConverter<TaxeSejourAnnuel, TaxeSejourAnnuelDto> {

    @Autowired
    private TauxTaxeSejourAnnuelConverter tauxTaxeSejourAnnuelConverter ;
    private boolean tauxTaxeSejourAnnuel;

    public  TaxeSejourAnnuelConverter() {
        super(TaxeSejourAnnuel.class, TaxeSejourAnnuelDto.class);
        init(true);
    }

    @Override
    public TaxeSejourAnnuel toItem(TaxeSejourAnnuelDto dto) {
        if (dto == null) {
            return null;
        } else {
        TaxeSejourAnnuel item = new TaxeSejourAnnuel();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getMontantBase()))
                item.setMontantBase(dto.getMontantBase());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(StringUtil.isNotEmpty(dto.getEtatTaxeSejour()))
                item.setEtatTaxeSejour(dto.getEtatTaxeSejour());
            if(StringUtil.isNotEmpty(dto.getMontantTotal()))
                item.setMontantTotal(dto.getMontantTotal());
            if(StringUtil.isNotEmpty(dto.getMontantRetard()))
                item.setMontantRetard(dto.getMontantRetard());
            if(StringUtil.isNotEmpty(dto.getNbrMoisRetard()))
                item.setNbrMoisRetard(dto.getNbrMoisRetard());
            if(this.tauxTaxeSejourAnnuel && dto.getTauxTaxeSejourAnnuel()!=null &&  dto.getTauxTaxeSejourAnnuel().getId() != null)
                item.setTauxTaxeSejourAnnuel(tauxTaxeSejourAnnuelConverter.toItem(dto.getTauxTaxeSejourAnnuel())) ;




        return item;
        }
    }

    @Override
    public TaxeSejourAnnuelDto toDto(TaxeSejourAnnuel item) {
        if (item == null) {
            return null;
        } else {
            TaxeSejourAnnuelDto dto = new TaxeSejourAnnuelDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getMontantBase()))
                dto.setMontantBase(item.getMontantBase());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
            if(StringUtil.isNotEmpty(item.getEtatTaxeSejour()))
                dto.setEtatTaxeSejour(item.getEtatTaxeSejour());
            if(StringUtil.isNotEmpty(item.getMontantTotal()))
                dto.setMontantTotal(item.getMontantTotal());
            if(StringUtil.isNotEmpty(item.getMontantRetard()))
                dto.setMontantRetard(item.getMontantRetard());
            if(StringUtil.isNotEmpty(item.getNbrMoisRetard()))
                dto.setNbrMoisRetard(item.getNbrMoisRetard());
            if(this.tauxTaxeSejourAnnuel && item.getTauxTaxeSejourAnnuel()!=null) {
                dto.setTauxTaxeSejourAnnuel(tauxTaxeSejourAnnuelConverter.toDto(item.getTauxTaxeSejourAnnuel())) ;

            }


        return dto;
        }
    }

    public void copy(TaxeSejourAnnuelDto dto, TaxeSejourAnnuel t) {
    super.copy(dto, t);
    if (dto.getTauxTaxeSejourAnnuel() != null)
        tauxTaxeSejourAnnuelConverter.copy(dto.getTauxTaxeSejourAnnuel(), t.getTauxTaxeSejourAnnuel());
    }



    public void initObject(boolean value) {
        this.tauxTaxeSejourAnnuel = value;
    }


    public TauxTaxeSejourAnnuelConverter getTauxTaxeSejourAnnuelConverter(){
        return this.tauxTaxeSejourAnnuelConverter;
    }
    public void setTauxTaxeSejourAnnuelConverter(TauxTaxeSejourAnnuelConverter tauxTaxeSejourAnnuelConverter ){
        this.tauxTaxeSejourAnnuelConverter = tauxTaxeSejourAnnuelConverter;
    }
    public boolean  isTauxTaxeSejourAnnuel(){
        return this.tauxTaxeSejourAnnuel;
    }
    public void  setTauxTaxeSejourAnnuel(boolean tauxTaxeSejourAnnuel){
        this.tauxTaxeSejourAnnuel = tauxTaxeSejourAnnuel;
    }
}
