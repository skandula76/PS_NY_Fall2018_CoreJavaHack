package PSNYHack;

public class PortfolioVO {

  public int RowNum;
  public String DateTimeEST;
  public String Sector;
  public String Ticker;
  public String CompanyName;
  public int UnitsofHolding;
  public String Currency;
  public double Price;

  public PortfolioVO(int rownum, String datetimeest, String sector, 
                          String ticker, String companyname, int unitsofholding,
                                  String currency, double price) {

            this.RowNum = rownum;
            this.DateTimeEST = datetimeest;
            this.Sector = sector;
            this.Ticker = ticker;
            this.CompanyName = companyname;
            this.UnitsofHolding = unitsofholding;
            this.Currency = currency;
            this.Price = price;

  }

}