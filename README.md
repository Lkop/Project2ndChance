# PROJECT2ndCHANCE


A maven project

### Phase 1

The application read every proposal from folder named "proposals" and checks if they meet the minimum requirements.

**Minimum Requirements** (Proposal should contain:)

* Developer's
  * Name
  * Lastname
  * Email
  * University
  * Current semester

* Mentor's
  * Name
  * Lastname
  * Email
  
### Phase 2

App makes the mapping with the awards.  
Awards are located in a folder named "awards".

### Phase 3

Prints every developer who finished successfully their project.


### Instructions
1. Awards are uploaded to the folder called "awards" and checked for any mistake.
1. Developers upload their proposals to "proposals" folder through a PR.
1. Mentors make a PR with their details.
1. The application check the data for any mistake.
1. Proposals that passed the check successfully continue to the "Mapping Phase".
1. In "Mapping Phase" the application maps the awards with the proposals.
1. Mentors change the "Final Pass" field through a PR in the proposals.
1. The application prints every developer that finised succesfully their project (if "Final Pass" is positive).

## License

GNU General Public License v3.0
