# PS_NY_Fall2018_CoreJavaHack


Problem Statement

Build an intraday, near real-time, Daily Profit/Loss ‘PnL’ aggregation module as a standalone component for Global Equities Desk.

Allows for easier access to multi-geographic, multi-sector portfolio aggregation with flexible handler to support real time changes to market values.

Hackathon Objectives

Objective 1 – Ingest ‘Bootstrap’ holdings data from End of the Previous Day			(50 points)

Objective 2 – Ingest real-time changes to stock prices ‘intra-day’ by processing mini-batch of files as they appear in a folder																	(150 points)

Objective 3 - Calculate and Show ‘real-time’ PnL by the handle through an interactive command or visual interface, without restarting the file processing. Examples, but not limited to:
															(150 points) – Calc / Command line
															(150 points) – Visual and/or Time-sliced
                              
                              
showPnL /global															
showPnL /global/nam
showPnL /global/apac
showPnL /global/nam/fin
showPnL /global/name/fin:BAC
(Note: Candidate can come up with alternate command conventions (like parameter prefixes like –h, -s etc.,) as long as they are intuitive and not constricting)
