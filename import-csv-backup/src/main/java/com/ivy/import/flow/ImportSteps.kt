package com.ivy.import.flow

import androidx.compose.runtime.Composable
import com.ivy.import.flow.instructions.*
import com.ivy.wallet.domain.deprecated.logic.csv.model.ImportType

@Composable
fun ImportSteps(
    type: ImportType,
    onUploadClick: () -> Unit
) {
    when (type) {
        ImportType.IVY -> {
            IvyWalletSteps(
                onUploadClick = onUploadClick
            )
        }
        ImportType.MONEY_MANAGER -> {
            MoneyManagerPraseSteps(
                onUploadClick = onUploadClick
            )
        }
        ImportType.WALLET_BY_BUDGET_BAKERS -> {
            WalletByBudgetBakersSteps(
                onUploadClick = onUploadClick
            )
        }
        ImportType.SPENDEE -> SpendeeSteps(
            onUploadClick = onUploadClick
        )
        ImportType.MONEFY -> MonefySteps(
            onUploadClick = onUploadClick
        )
        ImportType.ONE_MONEY -> OneMoneySteps(
            onUploadClick = onUploadClick
        )
        ImportType.BLUE_COINS -> DefaultImportSteps(
            onUploadClick = onUploadClick
        )
        ImportType.KTW_MONEY_MANAGER -> KTWMoneyManagerSteps(
            onUploadClick = onUploadClick
        )
        ImportType.FORTUNE_CITY -> FortuneCitySteps(
            onUploadClick = onUploadClick
        )
        ImportType.FINANCISTO -> FinancistoSteps(
            onUploadClick = onUploadClick
        )
    }
}