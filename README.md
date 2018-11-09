# Publicis.Sapient Fall2018 Core Java Hackathon


Problem Statement

Calculating daily Profit & Loss (‘PnL’) of portfolio of stocks is a key part amongst many processes that are typical for our clients.
We want you to build an intra-day Profit/Loss ‘PnL’ calculation and aggregation (group of stocks) module as a standalone component for a hypothetical Global Equities (Stocks) Desk.
The component should provide summarization of profit (or loss) across multiple groupings of stocks when market values (stock prices) change.
Context and Business Domain

A working application (Java Console based application) to be built which allows users of the ‘application’ to:
•	Ability to query the system to determine the real-time PnL for a global equity portfolio.  
•	Ability request PnL summary (‘sum’) on any subset of the portfolio, including for particular regions (e.g. North America) or sector (e.g. Finance).

The system receives a ‘bootstrap’ snapshot of the portfolio from the previous day’s close of business and uses that as a basis for all PnL calculations.  Throughout the ‘day’ (defined as multiple files) the system receives intra-day price updates and is be expected to process this information in real-time.
PnL in a currency = PrevDay Value of Portfolio – Current Value of Portfolio
Value of portfolio = Sum of all stock values
Stock value = # of stocks of a particular company * stock price in a single currency
Use Cases
For the exercise the following high-level set of use cases need to be fulfilled:
•	Ability to ingest ‘bootstrap’ portfolio information
•	Ability to ingest real-time pricing updates throughout the day (multiple files)
•	Calculate and show real-time PnL calculations for the portfolio
•	Ability to handle prices in a variety of currencies and convert prices into the local currency (USD)
•	Ability for the user to query PnL information on any level of the portfolio such as ‘Global’, ‘North America’, or ‘North America – Finance’
•	Ability to display PnL data in text format 
•	Ability to display PnL data as a line chart

Tools

The application should be developed using Java 8 or later.  You are free to use any IDE.
A small set of utilities will be provided to assist with some of the tasks and to speed up the development:
•	File Handler Utility – a file parser that will read the portfolio information
•	Graphing Utility – displays a line chart provided data
•	FX conversion utility – handles conversion between currencies


Hackathon Demo Steps:

showPnL /global															
showPnL /global/nam
showPnL /global/apac
showPnL /global/nam/fin
showPnL /global/name/fin:BAC
(Note: Candidate can come up with alternate command conventions (like parameter prefixes like –h, -s etc.,) as long as they are intuitive and not constricting)


Utilities, Helper Classes & Solution Assumptions


File Handler Helper – A file handler class will be provided that parses bootstrap and any ‘real-time’ files into a structured value object(s). It is candidate’s responsibility to leverage this code in any way helpful to incorporate into his/her main module(s). Candidate can build a better one his/her own for additional credits.

A graphing utility – A graphing utility code will be provided to show any time-series data visually. It is candidate’s responsibility to leverage this code in any way helpful to incorporate into his/her module(s). Candidate can build a better one on his/her own for additional credits. Example: This utility shows a line chart with X-axis (time in 1 hour increments), Y-Axis (Price, PnL, etc.,).

FX conversion utility – A static FX conversion utility code will be provided to convert prices or any derived values from one currency to another currency. It is candidate’s responsibility to leverage this code in any way helpful to incorporate into his/her module(s). No additional credits for building his/her own as this is a simple static conversion utility.

Solution Assumptions:

Stock holding amounts do not change from the previous day. If Holding amount is provided in the file, it can be ignored or processed, no changes to holding amounts
Prices may not change at all during the day for a given set of stocks
Prices will not be negative or zero
No new stocks (or holdings) would be added or removed to the portfolio during the day
Regions and Sectors are static
A new file or multiple files might be dropped into a ‘landing folder’ and should be immediately processed and PnL should be reflected
All times quoted are in EST (Single time-zone throughout the data sets)
Files are provided in 1 hour increments and snapshotted respectively (no other intermediary time periods will be posted) – Only following could be posted (PREV_DAY, 7AM, 8AM, 9AM, 10AM, 11AM, 12PM, 1PM, 2PM, 3PM, 4PM, 5PM, 6PM, 7PM)
Files will be sequenced for ease of use but candidate can manually drop files in a sequence if needed (No penalties for manually dropping the files in the drop zone) during the Demo(s)
No persistent data store is expected, module needs to be able to restart from “Start of the Day” if required by terminating all the appropriate daemons and restarting in necessary sequence
