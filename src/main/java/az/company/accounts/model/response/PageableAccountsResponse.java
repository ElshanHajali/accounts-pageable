package az.company.accounts.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageableAccountsResponse {

    private List<AccountsResponse> accounts;
    private long totalElements;
    private int totalPages;
    private boolean hasNextPage;

}
